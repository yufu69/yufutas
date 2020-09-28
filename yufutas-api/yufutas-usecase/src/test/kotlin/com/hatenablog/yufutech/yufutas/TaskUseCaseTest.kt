package com.hatenablog.yufutech.yufutas

import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Test

class TaskUseCaseTest : UseCaseTestBase() {
    @InjectMockKs
    private lateinit var target: TaskUseCase
    @MockK
    private lateinit var taskPort: TaskPort

    @Test
    fun タスクを新規登録できる() {
        val task = mockk<Task>()

        every { taskPort.register(task) } just Runs

        target.register(task)

        verify { taskPort.register(task) }
    }

}
