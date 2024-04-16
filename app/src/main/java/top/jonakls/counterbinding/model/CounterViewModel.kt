package top.jonakls.counterbinding.model

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    val counter: ObservableField<String> = ObservableField<String>("0")

    fun increment() {
        var value = Integer.parseInt(this.rawValue()) // "0" ---> 0
        value++
        this.counter.set(value.toString()) // "0" ---> 0
    }

    fun decrement() {
        var value = Integer.parseInt(this.rawValue()) // "0" ---> 0
        value--
        this.counter.set(value.toString()) // "1" ---> 0
    }

    private fun rawValue(): String {
        return counter.get() ?: return "0"
    }
}