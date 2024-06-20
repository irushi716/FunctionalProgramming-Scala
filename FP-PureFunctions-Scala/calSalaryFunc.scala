import scala.compiletime.ops.int
object calSalaryFunc{
    def calWage(h:Int):Double = {
        h*150
    }   

    def calOT(hOt:Int):Double = {
        hOt*75
    }

    def calIncome(h:Int,hOt:Int):Double = {
        calWage(h)*calOT(hOt)
    }

    def calTax(h:Int,hOt:Int):Double = {
        calIncome(h,hOt)*0.1
    }

    def calTakeHome(h:Int,hOt:Int):Double = {
        calIncome(h,hOt)-calTax(h,hOt)
    }

}