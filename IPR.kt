fun TipTimeLayout() {
    var B by remember { mutableStateOf("") }
    var J by remember { mutableStateOf("") }
    var J_D by remember { mutableStateOf(false) }

    val amount = amountInput.toDoubleOrNull() ?: 0.0
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount, tipPercent, roundUp)


 B  = formation volume factor, bbl/stb
 J  = productivity index, stb/d/psia
 J_D  = dimensionless productivity index, dimensionless
 kh = permeability times thickness, md*ft
 P  = pressure, psia
 \bar{P}  = average reservoir pressure, psia
 q  = flowing rate, stb/d
 S  = skin factor, dimensionless
