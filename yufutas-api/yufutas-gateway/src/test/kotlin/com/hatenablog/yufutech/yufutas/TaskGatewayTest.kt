package com.hatenablog.yufutech.yufutas

import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.OverrideMockKs
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks

class TaskGatewayTest : GatewayTestBase() {
    @OverrideMockKs
    private lateinit var target: TaskGateway

    @MockK
    private lateinit var taskDriver: TaskDriver

    @Test
    fun 指定されたタスク名でタスクを新規登録できる() {
        val task = Task(TaskName("task1"))

        every { taskDriver.save(task) } just Runs

        target.register(task)

        verify { taskDriver.save(task) }
    }
}