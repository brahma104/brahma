package in.amazon.mobile.services.servlet;

import in.amazon.mobile.services.delegate.ManageMobileDelegate;
import in.amazon.mobile.services.valueobjects.RechargeStatusVo;
import in.amazon.mobile.services.valueobjects.RechargeVo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RechargeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse resonse) throws ServletException, IOException {
		RechargeVo rechargeVo = null;
		RechargeStatusVo statusVo = null;
		ManageMobileDelegate manageMobileDelegate = null;

		rechargeVo = new RechargeVo();
		rechargeVo.setMobileNo(request.getParameter("mobileNo"));
		rechargeVo.setProvider(request.getParameter("provider"));
		rechargeVo.setSubscriberType(request.getParameter("subscriberType"));
		rechargeVo.setPaymentType(request.getParameter("paymentType"));
		rechargeVo.setAmount(request.getParameter("amount"));

		manageMobileDelegate = new ManageMobileDelegate();
		statusVo = manageMobileDelegate.recharge(rechargeVo);
		request.setAttribute("status", statusVo);
		request.getRequestDispatcher("/recharge-success.jsp").forward(request,
				resonse);
	}

}
