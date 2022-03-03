import kotlin.random.Random


fun main() {
    var min = 1
    var max = 100
    var num = 0
    var time = 3
    var key = Random.nextInt(100) + 1

    while (num != key&&time>0) {
        println("key is $key")
        println("please enter $min to $max you have $time time")
        readLine()?.let {  //有值就做
            num = it.toInt()    //it 的值就是上面的讀入字串
            time--
            when {
                num > key -> {
                    max = num
                }
                num < key -> {
                    min = num
                }
                else -> {
                    print("ans num is $key")

                }
            }

        }
    }
if (time<=0){print("You lose")}
}