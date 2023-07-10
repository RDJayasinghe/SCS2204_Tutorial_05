object q6 {
    def Fibo(n:Int): Int = n match {
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => Fibo(x-1) + Fibo(x-2)
    }

    def printFibo(n:Int): Any = {
        if(n >= 0){
            printFibo(n-1)
            println(Fibo(n))
        }
    }

    def main(args: Array[String]): Unit = {
        printFibo(10);

    }

}