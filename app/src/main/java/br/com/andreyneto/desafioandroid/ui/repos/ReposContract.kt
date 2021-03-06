package br.com.andreyneto.desafioandroid.ui.repos

import android.content.Context
import br.com.andreyneto.desafioandroid.model.Repo
import br.com.andreyneto.desafioandroid.ui.base.BasePresenter
import br.com.andreyneto.desafioandroid.ui.base.BaseView

class ReposContract {

    interface View: BaseView<Presenter> {
        fun showData(items: List<Repo>)
    }

    interface Presenter: BasePresenter {
        fun getData(page: Int = 1)
        fun openRepo(context: Context, repo: Repo)
    }
}