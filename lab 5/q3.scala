object q3 {
    def sum(n:Int):Int = {
        if(n != 0){
            n + sum(n-1)
        }
        else{
            0
        }
    }

    def main(args: Array[String]): Unit = {
        println(sum(5))

    }

}