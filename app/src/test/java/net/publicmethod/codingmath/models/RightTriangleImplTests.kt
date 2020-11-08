package net.publicmethod.codingmath.models

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Ignore
import java.lang.IllegalStateException

class RightTriangleImplTests {

    @Test
    fun `throw if side C is not hypotenuse`() {

        var error: Throwable? = null

        try {

            RightTriangleImpl(
                sideA = 3f,
                sideB = 2f,
                sideC = 1f
            )

        } catch (e: IllegalStateException) {

            error = e

        }

        assertNotNull(error)

    }

    @Test
    fun `constructor with only sides A and B sets side C to correct value`() {

        val expected = 3.6055512f

        val triangle = RightTriangleImpl(
            sideA = 2f,
            sideB = 3f,
        )

        val actual = triangle.sideC

        assertEquals(expected, actual)

    }

    @Test
    fun `get hypotenuse returns side C`() {

        val triangle = RightTriangleImpl(2f,3f)

        assertEquals(triangle.sideC, triangle.hypotenuse)

    }

    @Test
    fun `get adjacentA returns sideB`() {

        val triangle = RightTriangleImpl(
            2f,3f
        )

        assertEquals(triangle.sideB, triangle.adjacentA)

    }

    @Test
    fun `get oppositeA return sideA`() {

        val triangle = RightTriangleImpl(
            2f,3f
        )

        assertEquals(triangle.sideA, triangle.oppositeA)

    }

    @Test
    fun `get adjacentB returns sideA`() {

        val triangle = RightTriangleImpl(
            2f,3f
        )

        assertEquals(triangle.sideA, triangle.adjacentB)

    }

    @Test
    fun `get oppositeB returns sideB`() {

        val triangle = RightTriangleImpl(
            3f,2f
        )

        assertEquals(triangle.sideB, triangle.oppositeB)

    }

    @Test
    fun `get sinA returns correct Float`() {

        val expected = 0.5547002f // 2 / 3.6055512f

        val triangle = RightTriangleImpl(
            2f, 3f
        )

        val actual = triangle.sinA

        assertEquals(expected, actual)

    }

    @Test
    fun `get cosA returns correct Float`() {

        val expected = 0.8320503f // 3 / 3.6055512f

        val triangle = RightTriangleImpl(
            2f, 3f
        )

        val actual = triangle.cosA

        assertEquals(expected, actual)

    }

    @Test
    @Ignore("Not Implemented Yet")
    fun getTanA() {



    }

    @Test
    @Ignore("Not Implemented Yet")
    fun getSinB() {



    }

    @Test
    @Ignore("Not Implemented Yet")
    fun getCosB() {



    }

    @Test
    @Ignore("Not Implemented Yet")
    fun getTanB() {



    }

}