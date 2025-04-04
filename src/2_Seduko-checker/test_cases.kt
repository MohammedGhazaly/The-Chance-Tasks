package `2_Seduko-checker`

import check

fun main(){
    //         Invalid casess

    check(name = "Return false when at least one box has repeated number (Second box)", correctResult =isValidSeduko(board =  listOf(
        listOf("5", "3", "-", "-", "5", "-", "-", "-", "-"),
        listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = false)
    check(name = "Return false when at least one row has repeated number (First row)", correctResult =isValidSeduko(board = listOf(
        listOf("5", "3", "-", "-", "7", "5", "-", "-", "-"),
        listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = false)

    check(name = "Return false when at least one Column has repeated number (First Column)", correctResult =isValidSeduko(board = listOf(
        listOf("5", "3", "-", "-", "7", "5", "-", "-", "-"),
        listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("5", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = false)
    check(name = "Return false when the Rows and Columns are not equal (8 * 9)", correctResult =isValidSeduko(board = listOf(

        listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("5", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = false)
    check(name = "Return false when the Rows and Columns are not equal (9 * 8)", correctResult =isValidSeduko(board = listOf(
        listOf("5", "3", "-", "-", "7", "5", "-", "-", ),
        listOf("6", "-", "-", "1", "9", "5", "-", "-", ),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", ),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", ),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", ),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", ),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", ),
        listOf("9", "-", "-", "4", "1", "9", "-", "-", ),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", )
    )) , result = false)

//

    check(name = "Return false the numbers are less than or equal to zero or greater than 9 ", correctResult =isValidSeduko(board =  listOf(
        listOf("5", "3", "-", "-", "5", "-", "-", "-", "-"),
        listOf("6", "-", "-", "1", "9", "4", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = false)


//        Valid Cases
    check(name = "Return true when the board is valid and non of the previus cases are not present ", correctResult =isValidSeduko(board = listOf(
        listOf("5", "4", "-", "-", "3", "-", "-", "-", "-"),
        listOf("6", "-", "-", "1", "9", "5", "-", "-", "-"),
        listOf("-", "9", "8", "-", "-", "-", "-", "6", "-"),
        listOf("8", "-", "-", "-", "6", "-", "-", "-", "3"),
        listOf("4", "-", "-", "8", "-", "3", "-", "-", "1"),
        listOf("7", "-", "-", "-", "2", "-", "-", "-", "6"),
        listOf("-", "6", "-", "-", "-", "-", "2", "8", "-"),
        listOf("-", "-", "-", "4", "1", "9", "-", "-", "5"),
        listOf("-", "-", "-", "-", "8", "-", "-", "7", "9")
    )) , result = true)
}
