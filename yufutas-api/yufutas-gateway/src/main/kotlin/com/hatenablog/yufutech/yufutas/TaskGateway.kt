package com.hatenablog.yufutech.yufutas

import javax.inject.Named

@Named
class TaskGateway(private val taskDriver: TaskDriver) : TaskPort {
    override fun register(task: Task) {
        taskDriver.save(task)
    }
}