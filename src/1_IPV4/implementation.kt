package `1_IPV4`

fun isValidIPV4Address(ipAddress:String):Boolean{
    val segments = ipAddress.split(".")
    if (segments.size != 4) return false

    for (segment in segments) {
        if (segment.isEmpty() || segment.length > 3) return false
        if (segment.length > 1 && segment.startsWith('0')) return false // Leading zero

        val num = segment.toIntOrNull() ?: return false
//        if(num == null){
//            return false
//        }

        if (num < 0 || num > 255) return false
    }
    return true

}