fun main(){
    //VALID CASES
    check(
        name = "Return true When ip address is correct and they are different and between 0 and 255",
        correctResult = isValidIPV4Address("192.168.1.1"),
        result = true,
    )
    check(
        name = "Return true when ip address is correct and they all are equal 0",
        correctResult = isValidIPV4Address("0.0.0.0"),
        result = true,
    )
    check(
        name = "Return true when ip address is correct and they all are equal 255",
        correctResult = isValidIPV4Address("255.255.255.255"),
        result = true,
    )
    check(
        name = "Return true when ip address is correct and they contain zeros, 255 and other numbers",
        correctResult = isValidIPV4Address("196.168.0.255"),
        result = true,
    )
    //    INVALID CASSES
    check(
        name = "Return false when one or more than one cell of the numbers is greater than 255",
        correctResult = isValidIPV4Address("256.100.50.25"),
        result = false,
    )
    check(
        name = "Return false when one or more than one cell of the numbers is less than 0",
        correctResult = isValidIPV4Address("250.-10.50.25"),
        result = false,
    )
    check(
        name = "Return false when the number of cells are less than 4 ",
        correctResult = isValidIPV4Address("256.10.50"),
        result = false,
    )
    check(
        name = "Return false when the number of cells are more than 4 ",
        correctResult = isValidIPV4Address("256.10.50.25.35"),
        result = false,
    )
    check(
        name = "Return false when the segments contains words",
        correctResult = isValidIPV4Address("asdasd.zx.wq.sd.asd"),
        result = false,
    )
    check(
        name = "Return false when the segments contains special characters",
        correctResult = isValidIPV4Address("192.168.!.10"),
        result = false,
    )
    check(
        name = "return false when there is 01 or 001",
        correctResult = isValidIPV4Address("192.168.01.1"),
        result = false,
    )
    check(
        name = "Return false when there is 01 or 001",
        correctResult = isValidIPV4Address("192.168.001.1"),
        result = false,
    )
    check(
        name = "Return false When there is a trailing dot",
        correctResult = isValidIPV4Address("192.168.185.1."),
        result = false,
    )
    check(
        name = "Return false When there is a leading dot",
        correctResult = isValidIPV4Address(".192.168.185.1"),
        result = false,
    )
    check(
        name = "Return false When there is double dot",
        correctResult = isValidIPV4Address("192..168.185.1"),
        result = false,
    )
}

fun check(name:String,result :Boolean,correctResult:Boolean) {
    if(result == correctResult ){
        println("Success -> $name")
    }else{
        println("Failure -> $name")

    }
}