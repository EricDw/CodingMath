package net.publicmethod.codingmath.models

import kotlin.math.max

interface RightTriangle : Triangle {
    /**
     * The longest side of a right triangle.
     * */
    val hypotenuse: Float

    val adjacentA: Float
    val oppositeA: Float

    val adjacentB: Float
    val oppositeB: Float

    // SOH A
    val sinA: Float

    // CAH A
    val cosA: Float

    // TOA A
    val tanA: Float

    // SOH B
    val sinB: Float

    // CAH B
    val cosB: Float

    // TOA B
    val tanB: Float

}