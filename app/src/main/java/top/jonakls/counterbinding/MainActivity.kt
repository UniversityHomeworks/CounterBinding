package top.jonakls.counterbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import top.jonakls.counterbinding.databinding.ActivityMainBinding
import top.jonakls.counterbinding.model.CounterViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val activityMainBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val counterViewModel: CounterViewModel =
            ViewModelProvider(this)[CounterViewModel::class.java]
        activityMainBinding.counterModel = counterViewModel
    }
}