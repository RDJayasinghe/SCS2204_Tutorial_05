object q1 {
    def gcd(a:Int, b:Int): Int = b match {
        case 0 => a
        case x if x>a => gcd(x,a)
        case x => gcd(x, a%x)
    }

    def isPrime(n:Int, temp:Int=2):Boolean = temp match {
        case x if(x == n) => true
        case x if gcd(n,x)>1 => false
        case x => isPrime(n, x+1)
    }


    def main(args: Array[String]): Unit = {
        println(isPrime(5));
        println(isPrime(8));
          
    }

} 