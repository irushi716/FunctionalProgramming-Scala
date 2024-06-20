object Main extends App{
    var totalRunTime = totalRunTimeFunc.easyPaceCalc(2) + totalRunTimeFunc.tempoPaceCalc(3) + totalRunTimeFunc.easyPaceCalc(2)
    println(s"Total Running Time : $totalRunTime")

    var noOfCopies = 60
    var wholeSaleCost = wholeSaleCostFunc.costCalc(noOfCopies)
    println(f"Total wholesale cost for 60 copies : $wholeSaleCost%.2f")

    var takeHomeSalary = calSalaryFunc.calTakeHome(40,20)
    println(f"Total take home salary (40 working h, 20 Ot h) : $takeHomeSalary%.2f")

    //calHighestProfit profit = new calHighestProfit
    var profit = calHighestProfit.calProfit(20)
    println(f"Profit : $profit%.2f")
}