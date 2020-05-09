package com.gustavobarbosab.autodispose.first

import com.gustavobarbosab.autodispose.AutoClearedPresenter
import com.gustavobarbosab.autodispose.first.FirstContract.View

class FirstPresenter(view: View) : AutoClearedPresenter<View>(view), FirstContract.Presenter {

    override fun init() {
        view?.showInitToast()
    }

    override fun onCleared() {
        view?.showDestroyToast()
        super.onCleared()
    }
}