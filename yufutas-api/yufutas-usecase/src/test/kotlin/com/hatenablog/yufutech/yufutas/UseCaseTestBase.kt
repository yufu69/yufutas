package com.hatenablog.yufutech.yufutas

import io.mockk.MockKAnnotations
import io.mockk.unmockkAll
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

open class UseCaseTestBase {
    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @AfterEach
    fun tearDown() {
        unmockkAll()
    }
}