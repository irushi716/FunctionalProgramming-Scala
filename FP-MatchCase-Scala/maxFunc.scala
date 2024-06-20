object maxFunc{
    def max(x:Int,y:Int):Int = if (x>y) x else y

    def maximum(a:Int,b:Int):Int = (a>=b) match{
        case true => a
        case false => b
    }
}