object taxFunc{
    def tax(x:Int):Double = x match{
        case x if x <= 50000 => 0
        case x if x <= 100000 => x*0.1
        case x if x > 100000 => x*0.2
    }

    var hourPayRate = 500
    def netpay(h:Int):Double = {
        var g = h*hourPayRate
        g - tax(g)
    }
}