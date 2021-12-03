package org.techtown.repose

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.techtown.repose.Data.AppDatabase
import org.techtown.repose.MainActivity.Companion.user_days
import org.techtown.repose.MainActivity.Companion.user_timer
import org.techtown.repose.databinding.FragSelectTimerBinding


class SelectTimerFragment : Fragment(){
    lateinit var navController: NavController// 네비게이션 컨트롤러
    private var _binding: FragSelectTimerBinding? = null // 뷰바인딩
    private val binding get() = _binding!! // 뷰바인딩
    var mc : MainActivity = MainActivity()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragSelectTimerBinding.inflate(inflater,container,false) // 뷰바인딩
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mc.initRetrofit()
        mc.db = AppDatabase.getInstance(requireContext())!!
        CoroutineScope(Dispatchers.IO).launch {
            user_days = RoomDBGetWeekdayOfUserData(mc).toMutableList()
            user_timer = RoomDBGetHourOfUserData(mc).toMutableList()
        }
        navController = Navigation.findNavController(view) // 네비게이션 컨트롤러 view로 부터 가져오기
        set_init() // 초기 버튼 설정
        set_days() // 요일 설정
        set_time() // 시간 설정
        back_pressed() // 뒤로가기 버튼
        btn_back() // 화살표 뒤로가기 버튼
    }
    fun set_init(){
        if(user_days[0]){
            binding.btnMonday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[1]){
            binding.btnTuesday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[2]){
            binding.btnWednesday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[3]){
            binding.btnThursday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[4]){
            binding.btnFriday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[5]){
            binding.btnSaturday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_days[6]){
            binding.btnSunday.setBackgroundResource(R.drawable.green_border)
        }
        if(user_timer[0]){
            binding.switch1.isChecked = true
        }
        if(user_timer[1]){
            binding.switch2.isChecked = true
        }
        if(user_timer[2]){
            binding.switch3.isChecked = true
        }
        if(user_timer[3]){
            binding.switch4.isChecked = true
        }
        if(user_timer[4]){
            binding.switch5.isChecked = true
        }
        if(user_timer[5]){
            binding.switch6.isChecked = true
        }
        if(user_timer[6]){
            binding.switch7.isChecked = true
        }
        if(user_timer[7]){
            binding.switch8.isChecked = true
        }
        if(user_timer[8]){
            binding.switch9.isChecked = true
        }
        if(user_timer[9]){
            binding.switch10.isChecked = true
        }
        if(user_timer[10]){
            binding.switch11.isChecked = true
        }
        if(user_timer[11]){
            binding.switch12.isChecked = true
        }
    }
    fun set_days(){
        binding.btnMonday.setOnClickListener{
            if(!user_days[0]){
                binding.btnMonday.setBackgroundResource(R.drawable.green_border)
                user_days[0] = true
            }
            else{
                user_days[0] = false
                binding.btnMonday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,0, user_days[0])
            }
        }

        binding.btnTuesday.setOnClickListener{
            if(!user_days[1]){
                binding.btnTuesday.setBackgroundResource(R.drawable.green_border)
                user_days[1] = true
            }
            else{
                binding.btnTuesday.setBackgroundResource(R.drawable.white_border)
                user_days[1] = false
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,1, user_days[1])
            }
        }

        binding.btnWednesday.setOnClickListener{
            if(!user_days[2]){
                binding.btnWednesday.setBackgroundResource(R.drawable.green_border)
                user_days[2] = true
            }
            else{
                user_days[2] = false
                binding.btnWednesday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,2, user_days[2])
            }
        }
        binding.btnThursday.setOnClickListener{
            if(!user_days[3]){
                binding.btnThursday.setBackgroundResource(R.drawable.green_border)
                user_days[3] = true
            }
            else{
                user_days[3] = false
                binding.btnThursday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,3, user_days[3])
            }
        }
        binding.btnFriday.setOnClickListener{
            if(!user_days[4]){
                binding.btnFriday.setBackgroundResource(R.drawable.green_border)
                user_days[4] = true
            }
            else{
                user_days[4] = false
                binding.btnFriday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,4, user_days[4])
            }
        }
        binding.btnSaturday.setOnClickListener{
            if(!user_days[5]){
                binding.btnSaturday.setBackgroundResource(R.drawable.green_border)
                user_days[5] = true
            }
            else{
                user_days[5] = false
                binding.btnSaturday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,5, user_days[5])
            }
        }

        binding.btnSunday.setOnClickListener{
            if(!user_days[6]){
                binding.btnSunday.setBackgroundResource(R.drawable.green_border)
                user_days[6] = true
            }
            else{
                user_days[6] = false
                binding.btnSunday.setBackgroundResource(R.drawable.white_border)
            }
            CoroutineScope(Dispatchers.IO).launch {
                RoomDBUpdateWeekdayOfUserData(mc,6, user_days[6])
            }
        }
    }

    fun set_time(){
        binding.switch1.setOnCheckedChangeListener(timeSwitch_Listener(0 ,requireContext()))
        binding.switch2.setOnCheckedChangeListener(timeSwitch_Listener(1 ,requireContext()))
        binding.switch3.setOnCheckedChangeListener(timeSwitch_Listener(2 ,requireContext()))
        binding.switch4.setOnCheckedChangeListener(timeSwitch_Listener(3 ,requireContext()))
        binding.switch5.setOnCheckedChangeListener(timeSwitch_Listener(4 ,requireContext()))
        binding.switch6.setOnCheckedChangeListener(timeSwitch_Listener(5 ,requireContext()))
        binding.switch7.setOnCheckedChangeListener(timeSwitch_Listener(6 ,requireContext()))
        binding.switch8.setOnCheckedChangeListener(timeSwitch_Listener(7 ,requireContext()))
        binding.switch9.setOnCheckedChangeListener(timeSwitch_Listener(8 ,requireContext()))
        binding.switch10.setOnCheckedChangeListener(timeSwitch_Listener(9 ,requireContext()))
        binding.switch11.setOnCheckedChangeListener(timeSwitch_Listener(10 ,requireContext()))
        binding.switch12.setOnCheckedChangeListener(timeSwitch_Listener(11 ,requireContext()))
    }

    fun btn_back(){
        binding.btnBack.setOnClickListener{
            navController.popBackStack()
        }
    }

    fun back_pressed(){
        requireActivity().onBackPressedDispatcher.addCallback(object :
            OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                navController.popBackStack()
            }
        })
    }

    suspend fun RoomDBUpdateWeekdayOfUserData(mc: MainActivity, updateIndex: Int, set: Boolean){
        val tmpId = mc.db.userDao().getUserData()!!.id
        var tmpList = mc.db.userDao().getUserData()!!.weekday.toMutableList()
        tmpList[updateIndex] = set
        mc.db.userDao().updateUserDataWeekday(tmpId, tmpList.toList())
    }

    suspend fun RoomDBUpdateHourOfUserData(mc: MainActivity, updateIndex: Int, set: Boolean){
        val tmpId = mc.db.userDao().getUserData()!!.id
        var tmpList = mc.db.userDao().getUserData()!!.hour.toMutableList()
        tmpList[updateIndex] = set
        mc.db.userDao().updateUserDataHour(tmpId, tmpList.toList())
    }

    suspend fun RoomDBGetWeekdayOfUserData(mc: MainActivity):List<Boolean>{
        return mc.db.userDao().getUserData()!!.weekday
    }

    suspend fun RoomDBGetHourOfUserData(mc: MainActivity):List<Boolean>{
        return mc.db.userDao().getUserData()!!.hour
    }
}
class timeSwitch_Listener : CompoundButton.OnCheckedChangeListener{
    var idx : Int = 0
    var mc : MainActivity = MainActivity()

    constructor(idx : Int, context: Context){
        this.idx = idx
        mc.initRetrofit()
        mc.initRoomDB(context)
    }

    override fun onCheckedChanged(btn : CompoundButton?, isChecked: Boolean) {
        user_timer[idx] = isChecked
        CoroutineScope(Dispatchers.IO).launch {
            RoomDBUpdateHourOfUserData(mc,idx,user_timer[idx])
        }
    }

    suspend fun RoomDBUpdateHourOfUserData(mc: MainActivity, updateIndex: Int, set: Boolean){
        val tmpId = mc.db.userDao().getUserData()!!.id
        var tmpList = mc.db.userDao().getUserData()!!.hour.toMutableList()
        tmpList[updateIndex] = set
        mc.db.userDao().updateUserDataHour(tmpId, tmpList.toList())
    }

}