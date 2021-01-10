import kotlin.concurrent.timer

fun main() {
    var seceond = 0
    kotlin.concurrent.timer(period = 1000, initialDelay = 1000)
    {
        seceond++
        println(seceond)
        if(seceond == 10) {
            cancel()
            println("타이머종료")
        }
    }
}