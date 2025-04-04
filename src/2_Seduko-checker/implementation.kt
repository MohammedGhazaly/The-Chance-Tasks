package `2_Seduko-checker`


fun isValidSeduko(board:List<List<String>>) : Boolean{
    val boardSize = board.size
    val boxSize = Math.sqrt(boardSize.toDouble()).toInt()

    val rows = List(boardSize) { mutableListOf<Int>() }
    val cols = List(boardSize) { mutableListOf<Int>() }
    val boxes = List(boardSize) { mutableListOf<Int>() }


    // To handle if the list is empty or not squared
    if (boardSize == 0 || board.any { it.size != boardSize }) return false

    for (i in 0..boardSize -1){
        for (j in 0..boardSize -1 ){
            val currentValue = board[i][j]
            // If the current value is - skip the current loop
            if(currentValue == "-") continue

            // check if number is less than or equal to zero, has decimal numbers, has non-numeric values and most importantly is greater than board size
            val num = currentValue.toIntOrNull()
            if(num == null){
                return false
            }
            // CALCULATE THE CURRENT INDEX OF THE BOX

            //    Box 0 | Box 1 | Box 2
            //    ---------------------
            //    Box 3 | Box 4 | Box 5
            //    ---------------------
            //    Box 6 | Box 7 | Box 8
            // BOX 0 (ROWS => (0,1,2) and COLS => (0,1,2))
            // BOX 1 (ROWS => (0,1,2) and COLS => (3,4,5))
            // BOX 2 (ROWS => (0,1,2) and COLS => (6,7,8))

            // BOX 3 (ROWS => (3,4,5) and COLS => (0,1,2))
            // BOX 4 (ROWS => (3,4,5) and COLS => (3,4,5))
            // BOX 5 (ROWS => (3,4,5) and COLS => (6,7,8))

            // BOX 6 (ROWS => (6,7,8) and COLS => (0,1,2))
            // BOX 7 (ROWS => (6,7,8) and COLS => (3,4,5))
            // BOX 8 (ROWS => (6,7,8) and COLS => (6,7,8))
            val boxIndex = (i / boxSize) * boxSize + (j / boxSize)

            if (rows[i].contains(num) || cols[j].contains(num) || boxes[boxIndex].contains(num)) {
                return false
            }
            rows[i].add(num!!)
            cols[j].add(num)
            boxes[boxIndex].add(num)


        }
    }
    println(rows)
    println(cols)

    return  true;
}