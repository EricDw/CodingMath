package net.publicmethod.codingmath.models

import java.lang.IllegalStateException
import kotlin.math.hypot

data class RightTriangleImpl(
    override val sideA: Float,
    override val sideB: Float,
    override val sideC: Float = hypot(sideA, sideB)
) : RightTriangle {

    init {
        val hypo = hypot(sideA, sideB)
        if (hypo != sideC)
            throw IllegalStateException("Side C: $sideC must be equal to the hypotenuse: $hypo")
    }

    override val hypotenuse: Float =
        sideC

    override val adjacentA: Float =
        sideB

    override val oppositeA: Float =
        sideA

    override val adjacentB: Float =
        sideA

    override val oppositeB: Float =
        sideB

    override val sinA: Float =
        oppositeA / hypotenuse

    override val cosA: Float =
        adjacentA / hypotenuse

    override val tanA: Float =
        oppositeA / adjacentA

    override val sinB: Float =
        oppositeB / hypotenuse

    override val cosB: Float =
        adjacentB / hypotenuse

    override val tanB: Float =
        oppositeB / adjacentB

}