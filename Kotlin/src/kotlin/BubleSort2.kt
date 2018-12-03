package sorting


object BubleSort2 {


    fun bubleSort(sortlist: Array<Int>): List<Int>{
        var swapped : Boolean
        do{
            swapped = false
            for (i in 1 until sortlist.size - 1) {
                if (sortlist[i - 1] > sortlist[i]) {
                    sortlist[i - 1] = sortlist[i - 1] + sortlist[i]
                    sortlist[i] = sortlist[i - 1] - sortlist[i]
                    sortlist[i - 1] = sortlist[i - 1] - sortlist[i]
                    swapped = true
                }
            }
        }while (swapped)
        return mutableListOf<Int>(*sortlist)
    }
}

