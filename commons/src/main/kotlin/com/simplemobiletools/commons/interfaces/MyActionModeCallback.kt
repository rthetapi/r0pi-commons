package com.r0pi.commons.interfaces

import androidx.appcompat.view.ActionMode

abstract class MyActionModeCallback : ActionMode.Callback {
    var isSelectable = false
}
