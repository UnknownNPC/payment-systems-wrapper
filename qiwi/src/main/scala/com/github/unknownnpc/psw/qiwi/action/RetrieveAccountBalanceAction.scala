package com.github.unknownnpc.psw.qiwi.action

import com.github.unknownnpc.psw.api.action.ActionContext
import com.github.unknownnpc.psw.api.executor.RestHttpExecutor
import com.github.unknownnpc.psw.qiwi.model.QiwiModel.AccountBalance.{Request, Response}
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.CloseableHttpClient

private[qiwi] trait RetrieveAccountBalanceAction extends
  ActionContext[Request, Response, HttpGet, String] with RestHttpExecutor[HttpGet]

object RetrieveAccountBalanceAction {

  def apply(httpClientParam: CloseableHttpClient): RetrieveAccountBalanceAction = new RetrieveAccountBalanceAction() {
    override val httpClient: CloseableHttpClient = httpClientParam
  }

}