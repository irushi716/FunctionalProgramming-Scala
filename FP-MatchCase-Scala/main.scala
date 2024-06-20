object main extends App{
    println(s"Maximum of 10 and 5 is : ${maxFunc.max(10,5)}")
    println(s"Maximum of 10 and 5 is : ${maxFunc.maximum(5,10)}")

    println(s"If a student get 60 marks, he will ${passFailFunc.passfail(60)} the exam. ")

    println(s"53 is a ${evenFunc.isEven(53)} number.")

    println(s"2023 is a leap year : ${leapYFunc.isLeapY(2023)}")

    println(s"sign(-3) is equal to ${signFunc.sign(-3)}")

    println(s"Interest per year : ${interestFun.interest(150000)}, Final Account Balance : ${interestFun.balance(150000)}")

    println(s"Tax : ${taxFunc.tax(5000)}, Net Pay : ${taxFunc.netpay(10)}")
}