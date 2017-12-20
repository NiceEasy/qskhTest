package org.liufeng.weixin.main;

import org.liufeng.course.menu.Button;
import org.liufeng.course.menu.ClickButton;
import org.liufeng.course.menu.ComplexButton;
import org.liufeng.course.menu.Menu;
import org.liufeng.course.menu.ViewButton;
import org.liufeng.course.pojo.Token;
import org.liufeng.course.util.CommonUtil;
import org.liufeng.course.util.MenuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * �˵���������
 * 
 * @author liufeng
 * @date 2013-10-17
 */
public class MenuManagerHTS {
	private static Logger log = LoggerFactory.getLogger(MenuManagerHTS.class);

	/**
	 * ����˵��ṹ
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("��Դ�й�");
		btn11.setType("click");
		btn11.setKey("oschina");

		ClickButton btn12 = new ClickButton();
		btn12.setName("ITeye");
		btn12.setType("click");
		btn12.setKey("iteye");

		ViewButton btn13 = new ViewButton();
		btn13.setName("CocoaChina");
		btn13.setType("view");
		btn13.setUrl("http://www.iteye.com");

		ViewButton btn21 = new ViewButton();
		btn21.setName("�Ա�");
		btn21.setType("view");
		btn21.setUrl("http://m.taobao.com");

		ViewButton btn22 = new ViewButton();
		btn22.setName("����");
		btn22.setType("view");
		btn22.setUrl("http://m.jd.com");

		ViewButton btn23 = new ViewButton();
		btn23.setName("ΨƷ��");
		btn23.setType("view");
		btn23.setUrl("http://m.vipshop.com");

		ViewButton btn24 = new ViewButton();
		btn24.setName("������");
		btn24.setType("view");
		btn24.setUrl("http://m.dangdang.com");

		ViewButton btn25 = new ViewButton();
		btn25.setName("�����׹�");
		btn25.setType("view");
		btn25.setUrl("http://m.suning.com");

		ViewButton btn31 = new ViewButton();
		btn31.setName("����");
		btn31.setType("view");
		btn31.setUrl("http://www.duopao.com");

		ViewButton btn32 = new ViewButton();
		btn32.setName("һ��88");
		btn32.setType("view");
		btn32.setUrl("http://www.yi588.com");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("��������");
		mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("����");
		mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("��ҳ��Ϸ");
		mainBtn3.setSub_button(new Button[] { btn31, btn32 });

		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//��̩ʢ���������Ƽ����޹�˾
		String appId = "wx1f891f10fb428b2b";
//		// �������û�Ψһƾ֤��Կ
//		
		String appSecret ="2c85f7b7f2f725985afc6f5e7b0a04fd";
		
		// ���ýӿڻ�ȡƾ֤
		Token token = CommonUtil.getToken(appId, appSecret);

		if (null != token) {
			// �����˵�
/*			String menustr =  "{" +
					"\"button\":["+
					"{"+
					"\"type\":\"click\","+
					"\"name\":\"���ո���\","+
					"\"key\":\"V1001_TODAY_MUSIC\""+
						"},"+
					     "{"+
				          "\"name\":\"�˵�\","+
				           "\"sub_button\":["+
				           "{"	+
				              "\"type\":\"view\","+
				              "\"name\":\"����\","+
				              "\"url\":\"http://www.soso.com/\""+
				            "},"+
				            "{"+
				              "\"type\":\"view\","+
				               "\"name\":\"��Ƶ\","+
				               "\"url\":\"http://v.qq.com/\""+
				           " },"+
				           " {"+
				              "\"type\":\"click\","+
				              "\"name\":\"��һ������\","+
				              "\"key\":\"V1001_GOOD\""+
				            "}]"+
				       "}]"+
					"}";
			
			System.out.println(menustr);*/
			
			String menustra =  "{" +
								"\"button\":["+
										     "{"+
										          "\"name\":\"�˵���\","+
										           "\"sub_button\":" +
										           "["+
											           "{"+
											              "\"type\":\"view\","+
											              "\"name\":\"�û�ע��\","+
											              "\"url\":\"http://foncti.qskh.cn/toRegist\""+
											            "},"+
									              
											            "{"+
											              "\"type\":\"view\","+
											               "\"name\":\"�����\","+
											               "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											               "}" +
								                   "]" +
				                              "},"+
				             
									           "{"+
										          "\"name\":\"��ϵ����\","+
										           "\"sub_button\":["+
										           "{"	+
										              "\"type\":\"view\","+
										              "\"name\":\"�绰��\","+
										              "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
										            "}" +
										          "]"+
									          "}" +
							         "]"+
						        "}";
			
			String menustr="{" +
					"\"button\":["+
					"{"+
				       "\"type\":\"click\","+
				       "\"name\":\"�û�ע��\","+
				       "\"key\":\"V1001_TODAY_MUSIC\","+
				       "\"url\":\"lianxiUs\""+
				       "},"+
				       "{"+
				        
						"\"type\":\"click\","+
				          "\"name\":\"�����\","+
				          "\"key\":\"V1001_TODAY_SINGER\","+
				          "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
				  " },"+
				  "{"+
				       "\"type\":\"click\","+
				       "\"name\":\"��ϵ����\","+
				       "\"key\":\"V1001_HELLO_WORLD\","+
				       "\"url\":\"lianxiUs\""+
				       "}]"+
					"}";
			
			
			String menustrabc =  "{" +
					"\"button\":["+
							     "{"+
							          "\"name\":\"�˵���\","+
							           "\"sub_button\":" +
							           "["+
								           "{"+
								              "\"type\":\"view\","+
								              "\"name\":\"�û�ע��\","+
								              "\"url\":\"http://foncti.qskh.cn/toRegist\""+
								            "},"+
						              
								            "{"+
								              "\"type\":\"view\","+
								               "\"name\":\"�����\","+
								               "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
								               "}" +
					                   "]" +
	                              "},"+
	             
						           "{"+
							          "\"name\":\"��ϵ����\","+
							           "\"sub_button\":["+
							           "{"	+
							              "\"type\":\"view\","+
							              "\"name\":\"�绰��\","+
							              "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
							            "}" +
							          "]"+
						          "}" +
				         "]"+
			        "}";
			
			
			String menuUrlNew = "{" +
								"\"button\":["+
												"{"+
										          "\"name\":\"��Ҫ���\","+
													"\"type\":\"view\","+
													"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										       "}," +
									           "{"+
										          "\"name\":\"�����\","+
													"\"type\":\"view\","+
													"\"url\":\"http://foncti.qskh.cn/checkid\""+
										       "}," +
									           "{"+
										          "\"name\":\"��ϵ����\","+
													"\"type\":\"view\","+
													"\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
										       "}" +
								         "]"+
							       "}";
			
			String menuUrlNewaa = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"��Ҫ���\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"�����\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"�����\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"��Ҫ����\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
						           "{"+
							          "\"name\":\"��ϵ����\","+
										"\"type\":\"view\","+
										"\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
							       "}" +
					         "]"+
				       "}";
			
			
			
			
			String menuUrlNewbb = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"��Ҫ���\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"�����\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"�����\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"��Ҫ����\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"��\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"��������\","+
											        "\"url\":\"http://foncti.qskh.cn/toupdate\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ϵ����\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											         "}" +
											 "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			String menuUrlNewcc = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"��Ҫ���\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"�����\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"�����\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"��Ҫ����\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"��\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"��������\","+
											        "\"url\":\"http://foncti.qskh.cn/toupdate\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ϵ����\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ת����A\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ת����B\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/shareresultstmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ת����c\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}" +
											  "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			
			
			String menuUrlNewdd = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"��Ҫ���\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"�����\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"�����\","+
										        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"��Ҫ����\","+
										         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/shareresultstmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"��\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"��������\","+
											        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ϵ����\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											        "}," +
											  "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			
			String menuUrlNewee = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"��Ҫ���\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"�����\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"�����\","+
										        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"��Ҫ����\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"��\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"��������\","+
											        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"��ϵ����\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											        "}," +
											  "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			
//			String menustrxcl="{" +
//					"\"button\":["+
//					"{"+
//				       "\"type\":\"click\","+
//				       "\"name\":\"��¼\","+
//				       "\"key\":\"V1001_REPAIR_0001\","+
//				       "\"url\":\"http://www.xcl120.com/user/index.do\""+
//				       "},"+
//				       "{"+
//				        
//						"\"type\":\"click\","+
//				          "\"name\":\"����\","+
//				          "\"key\":\"V1001_REPAIR_0002\","+
//				          "\"url\":\"http://www.xcl120.com/store/index.do\""+
//				  " },"+
//				  "{"+
//				       "\"type\":\"click\","+
//				       "\"name\":\"��ϵ����\","+
//				       "\"key\":\"V1001_REPAIR_0003\","+
//				       "\"url\":\"http://www.xcl120.com/user/toRegist.do\""+
//				       "}]"+
//					"}";
			
			
//		String abcdrepairLang =	"{" +
//			"\"button\":["+
//							"{"+
//					          "\"name\":\"��¼\","+
//								"\"type\":\"view\","+
//								"\"url\":\"http://www.xcl120.com/user/index.do\""+
//					       "}," 
//							  +
//							  "{"+
//					          "\"name\":\"����\","+
//								"\"type\":\"view\","+
//								"\"url\":\"http://www.xcl120.com/store/index.do\""+
//					           "},"
//								 +
//	                               "{"+
//	 					          "\"name\":\"ע��\","+
//	 								"\"type\":\"view\","+
//	 								"\"url\":\"http://www.xcl120.com/user/toRegist.do\""+
//	 					       "}," +
// 					       "]"+
//		                "}";
			
		
		
//		String abcdrepairLangstr =	"{" +
//				"\"button\":["+
//								"{"+
//						          "\"name\":\"��¼\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/toLoginPinetreeCare\""+
//						       "}," 
//								  +
//								  "{"+
//						          "\"name\":\"�����\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/checkResultGongKang\""+
//						           "},"
//									 +
//	 					       "]"+
//			                "}";
			
		
//		String abcdrepairLangstr =	"{" +
//				"\"button\":["+
//								"{"+
//						          "\"name\":\"��¼\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/loginQSKH.jsp\""+
//						       "}," 
//								  +
//								  "{"+
//						          "\"name\":\"�����\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/checkResultPinetreeCare\""+
//						           "},"
//									 +
//	 					       "]"+
//			                "}";
		
		
		
		
		String abcdrepairLangstr =	"{" +
				"\"button\":["+
								"{"+
						          "\"name\":\"��¼\","+
									"\"type\":\"view\","+
									"\"url\":\"http://foncti.qskh.cn/toLoginHongTaiSheng\""+
						       "}," 
								  +
								  "{"+
						          "\"name\":\"�����\","+
									"\"type\":\"view\","+
									"\"url\":\"http://foncti.qskh.cn/checkResultHongTaiSheng\""+
						           "},"
									 +
									"{"+
									"\"name\":\"ע��\","+
										"\"type\":\"view\","+
										"\"url\":\"http://foncti.qskh.cn/toHTSRegister\""+
									"}," +
	 					       "]"+
			                "}";
			
			System.out.println(abcdrepairLangstr);
			boolean result = MenuUtil.createMenu(abcdrepairLangstr, token.getAccessToken());
			
			// �жϲ˵��������
			if (result)
				log.info("�˵������ɹ���");
			else
				log.info("�˵�����ʧ�ܣ�");
		}
	}
}
