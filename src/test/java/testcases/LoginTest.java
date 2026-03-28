package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddcustomerPage;
import pages.PayBill;
import pages.TariffPage;
import pages.TariffPlan;

public class LoginTest extends TestBase {
		AddcustomerPage hbj;
		TariffPage tbj;
	    TariffPlan pbj;
	    PayBill bbj;
//	    AddcustomerPage hbj;
		@BeforeClass
		public void objint() {
			
				hbj=new AddcustomerPage(driver);
				tbj=new TariffPage(driver);
				pbj=new TariffPlan(driver);
				bbj=new PayBill(driver);
			
				
		}
		@Test
		public void tc001_cstmr() throws InterruptedException {
			hbj.login("Hasna", "Fathima","hasna@gmail.com", "House 12 Street Kochi Kerala 682001", "0123456789");
			hbj.subtbtn();
			hbj.home();

		}
		@Test
		public void tc002_trf() throws InterruptedException {
			tbj.clk("499", "500", "100", "100 ", "1", "5", "2");;
			tbj.tariffbtn();

		}
		@Test
		public void tc003_trfpln() throws InterruptedException {
			pbj.clk("235964");;;
			pbj.tariffplnbtn();
			pbj.approveplan();

		}

		@Test
		public void tc004_pay() throws InterruptedException {
			bbj.clk("235964");
			bbj.paybill();

		}
}
