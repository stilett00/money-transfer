fun main() {
    val amount = 12563
    val commissionRate = 0.0075
    val minCommission = 35.0

    val commission = amount * commissionRate

    val result = if (commission < minCommission) minCommission else commission

    println("При переводе $amount руб. комиссия составит %.2f руб.".format(result))
}