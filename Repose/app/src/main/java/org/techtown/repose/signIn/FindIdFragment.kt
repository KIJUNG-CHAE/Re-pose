package org.techtown.repose.signIn

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.frag_find_id.*
import kotlinx.android.synthetic.main.frag_login.*
import kotlinx.android.synthetic.main.frag_login.login_btn
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.techtown.repose.Data.BeforeParsingUserData
import org.techtown.repose.Data.FindIdPwData
import org.techtown.repose.MainActivity
import org.techtown.repose.R
import org.techtown.repose.databinding.FragFindIdBinding
import retrofit2.Call
import retrofit2.Response

class FindIdFragment : Fragment() {
    lateinit var viewbinding: FragFindIdBinding
    var mc : MainActivity = MainActivity()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewbinding = FragFindIdBinding.inflate(inflater, container, false)
        return  viewbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mc.initRetrofit()
        find_btn.setOnClickListener{
            val tmpFindIdPwData = FindIdPwData(
                viewbinding.idEdittext.text.toString()
            )
            ApiCallSendEmailOfUserData(tmpFindIdPwData,mc)
        }

    }


    private fun ApiCallSendEmailOfUserData(findIdPwData: FindIdPwData, mc: MainActivity):Int {
        var responseCode: Int = 0
        mc.supplementService.email_check(findIdPwData).enqueue(object: retrofit2.Callback<BeforeParsingUserData> {
            override fun onResponse(call: Call<BeforeParsingUserData>, response: Response<BeforeParsingUserData>) {
                if(response.code() == 200){
                    Log.e("server","response ??????!!")
                }
                Log.e("response : ", response.body().toString())
                Log.e("responsecode : ", response.code().toString())
                responseCode = response.code().toInt()

                when(responseCode){
                    200 -> { //?????? ?????? ??????
                        CoroutineScope(Dispatchers.Main).launch {
                            Toast.makeText(requireContext(),"???????????? ???????????? ????????? ???????????????!", Toast.LENGTH_SHORT).show()
                            CoroutineScope(Dispatchers.Main).launch {
                                findNavController().navigate(R.id.action_frag_find_id_to_frag_find_success)
                            }
                        }
                    }
                    201 -> { //????????? ??????
                        CoroutineScope(Dispatchers.Main).launch {
                            Toast.makeText(requireContext(),"???????????? ???????????? ????????????. ???????????? ?????? ??? ?????? ??????????????????.", Toast.LENGTH_SHORT).show()
                        }
                    }
                    else -> { //?????? ?????? ??????(??????)
                        CoroutineScope(Dispatchers.Main).launch {
                            Toast.makeText(requireContext(),"?????? ????????? ?????????????????????!", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
            override fun onFailure(call: Call<BeforeParsingUserData>, t: Throwable) {
                Log.e("server","fail...")
                Log.e("server_throwable",t.toString())
                Log.e("server_call",call.toString())
            }
        })

        Log.e("fun code",responseCode.toString())
        return responseCode
    }

}