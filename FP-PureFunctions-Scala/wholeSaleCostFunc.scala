object wholeSaleCostFunc{
    var coverPrice = 24.95
    var discount = 0.4
    var addCopyCost = 0.75
    var shipCost = 3

    def costCalc(n:Int):Double = {
        if(n>=50) {
            (coverPrice*(1-discount)*n) + shipCost
        } else{
            (coverPrice*(1-discount)*n) + shipCost + (n - 50)*addCopyCost
        }       
    }
}