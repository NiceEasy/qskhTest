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
 * 菜单管理器类
 * 
 * @author liufeng
 * @date 2013-10-17
 */
public class MenuManagerHTS {
	private static Logger log = LoggerFactory.getLogger(MenuManagerHTS.class);

	/**
	 * 定义菜单结构
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("开源中国");
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
		btn21.setName("淘宝");
		btn21.setType("view");
		btn21.setUrl("http://m.taobao.com");

		ViewButton btn22 = new ViewButton();
		btn22.setName("京东");
		btn22.setType("view");
		btn22.setUrl("http://m.jd.com");

		ViewButton btn23 = new ViewButton();
		btn23.setName("唯品会");
		btn23.setType("view");
		btn23.setUrl("http://m.vipshop.com");

		ViewButton btn24 = new ViewButton();
		btn24.setName("当当网");
		btn24.setType("view");
		btn24.setUrl("http://m.dangdang.com");

		ViewButton btn25 = new ViewButton();
		btn25.setName("苏宁易购");
		btn25.setType("view");
		btn25.setUrl("http://m.suning.com");

		ViewButton btn31 = new ViewButton();
		btn31.setName("多泡");
		btn31.setType("view");
		btn31.setUrl("http://www.duopao.com");

		ViewButton btn32 = new ViewButton();
		btn32.setName("一窝88");
		btn32.setType("view");
		btn32.setUrl("http://www.yi588.com");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("技术交流");
		mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("购物");
		mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("网页游戏");
		mainBtn3.setSub_button(new Button[] { btn31, btn32 });

		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//鸿泰盛北京健康科技有限公司
		String appId = "wx1f891f10fb428b2b";
//		// 第三方用户唯一凭证密钥
//		
		String appSecret ="2c85f7b7f2f725985afc6f5e7b0a04fd";
		
		// 调用接口获取凭证
		Token token = CommonUtil.getToken(appId, appSecret);

		if (null != token) {
			// 创建菜单
/*			String menustr =  "{" +
					"\"button\":["+
					"{"+
					"\"type\":\"click\","+
					"\"name\":\"今日歌曲\","+
					"\"key\":\"V1001_TODAY_MUSIC\""+
						"},"+
					     "{"+
				          "\"name\":\"菜单\","+
				           "\"sub_button\":["+
				           "{"	+
				              "\"type\":\"view\","+
				              "\"name\":\"搜索\","+
				              "\"url\":\"http://www.soso.com/\""+
				            "},"+
				            "{"+
				              "\"type\":\"view\","+
				               "\"name\":\"视频\","+
				               "\"url\":\"http://v.qq.com/\""+
				           " },"+
				           " {"+
				              "\"type\":\"click\","+
				              "\"name\":\"赞一下我们\","+
				              "\"key\":\"V1001_GOOD\""+
				            "}]"+
				       "}]"+
					"}";
			
			System.out.println(menustr);*/
			
			String menustra =  "{" +
								"\"button\":["+
										     "{"+
										          "\"name\":\"菜单栏\","+
										           "\"sub_button\":" +
										           "["+
											           "{"+
											              "\"type\":\"view\","+
											              "\"name\":\"用户注册\","+
											              "\"url\":\"http://foncti.qskh.cn/toRegist\""+
											            "},"+
									              
											            "{"+
											              "\"type\":\"view\","+
											               "\"name\":\"检测结果\","+
											               "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											               "}" +
								                   "]" +
				                              "},"+
				             
									           "{"+
										          "\"name\":\"联系我们\","+
										           "\"sub_button\":["+
										           "{"	+
										              "\"type\":\"view\","+
										              "\"name\":\"电话号\","+
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
				       "\"name\":\"用户注册\","+
				       "\"key\":\"V1001_TODAY_MUSIC\","+
				       "\"url\":\"lianxiUs\""+
				       "},"+
				       "{"+
				        
						"\"type\":\"click\","+
				          "\"name\":\"检测结果\","+
				          "\"key\":\"V1001_TODAY_SINGER\","+
				          "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
				  " },"+
				  "{"+
				       "\"type\":\"click\","+
				       "\"name\":\"联系我们\","+
				       "\"key\":\"V1001_HELLO_WORLD\","+
				       "\"url\":\"lianxiUs\""+
				       "}]"+
					"}";
			
			
			String menustrabc =  "{" +
					"\"button\":["+
							     "{"+
							          "\"name\":\"菜单栏\","+
							           "\"sub_button\":" +
							           "["+
								           "{"+
								              "\"type\":\"view\","+
								              "\"name\":\"用户注册\","+
								              "\"url\":\"http://foncti.qskh.cn/toRegist\""+
								            "},"+
						              
								            "{"+
								              "\"type\":\"view\","+
								               "\"name\":\"检测结果\","+
								               "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
								               "}" +
					                   "]" +
	                              "},"+
	             
						           "{"+
							          "\"name\":\"联系我们\","+
							           "\"sub_button\":["+
							           "{"	+
							              "\"type\":\"view\","+
							              "\"name\":\"电话号\","+
							              "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
							            "}" +
							          "]"+
						          "}" +
				         "]"+
			        "}";
			
			
			String menuUrlNew = "{" +
								"\"button\":["+
												"{"+
										          "\"name\":\"我要检测\","+
													"\"type\":\"view\","+
													"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										       "}," +
									           "{"+
										          "\"name\":\"检测结果\","+
													"\"type\":\"view\","+
													"\"url\":\"http://foncti.qskh.cn/checkid\""+
										       "}," +
									           "{"+
										          "\"name\":\"联系我们\","+
													"\"type\":\"view\","+
													"\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
										       "}" +
								         "]"+
							       "}";
			
			String menuUrlNewaa = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"我要检测\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"检测结果\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"检测结果\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"我要分享\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
						           "{"+
							          "\"name\":\"联系我们\","+
										"\"type\":\"view\","+
										"\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
							       "}" +
					         "]"+
				       "}";
			
			
			
			
			String menuUrlNewbb = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"我要检测\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"检测结果\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"检测结果\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"我要分享\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"我\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"个人资料\","+
											        "\"url\":\"http://foncti.qskh.cn/toupdate\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"联系我们\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											         "}" +
											 "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			String menuUrlNewcc = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"我要检测\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"检测结果\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"检测结果\","+
										        "\"url\":\"http://foncti.qskh.cn/checkid\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"我要分享\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"我\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"个人资料\","+
											        "\"url\":\"http://foncti.qskh.cn/toupdate\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"联系我们\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"跳转测试A\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"跳转测试B\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/shareresultstmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}," +
											        "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"跳转测试c\","+
											         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											        "}" +
											  "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			
			
			String menuUrlNewdd = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"我要检测\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"检测结果\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"检测结果\","+
										        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"我要分享\","+
										         "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/shareresultstmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"我\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"个人资料\","+
											        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"联系我们\","+
											         "\"url\":\"http://foncti.qskh.cn/contactus.jsp\""+
											        "}," +
											  "]" +
			                               "}," +
					                  "]"+
				                "}";
			
			
			String menuUrlNewee = "{" +
					"\"button\":["+
									"{"+
							          "\"name\":\"我要检测\","+
										"\"type\":\"view\","+
										"\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/acceptWeChatcode/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
							       "}," 
									  +"{"+
										"\"name\":\"检测结果\","+
										 "\"sub_button\":" +
										 "["+
										     "{"+
										        "\"type\":\"view\","+
										        "\"name\":\"检测结果\","+
										        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/checkidtmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
										      "},"+
										
										      "{"+
										        "\"type\":\"view\","+
										         "\"name\":\"我要分享\","+
										         "\"url\":\"http://foncti.qskh.cn/shareresults\""+
										         "}" +
										 "]" +
		                               "}," +
										 
									    "{"+
											"\"name\":\"我\","+
											 "\"sub_button\":" +
											 "["+
											     "{"+
											        "\"type\":\"view\","+
											        "\"name\":\"个人资料\","+
											        "\"url\":\"https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx6e96f03580b1da7c&redirect_uri=http://foncti.qskh.cn/toupdatetmp/&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect\""+
											      "},"+
											
											      "{"+
											        "\"type\":\"view\","+
											         "\"name\":\"联系我们\","+
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
//				       "\"name\":\"登录\","+
//				       "\"key\":\"V1001_REPAIR_0001\","+
//				       "\"url\":\"http://www.xcl120.com/user/index.do\""+
//				       "},"+
//				       "{"+
//				        
//						"\"type\":\"click\","+
//				          "\"name\":\"购物\","+
//				          "\"key\":\"V1001_REPAIR_0002\","+
//				          "\"url\":\"http://www.xcl120.com/store/index.do\""+
//				  " },"+
//				  "{"+
//				       "\"type\":\"click\","+
//				       "\"name\":\"联系我们\","+
//				       "\"key\":\"V1001_REPAIR_0003\","+
//				       "\"url\":\"http://www.xcl120.com/user/toRegist.do\""+
//				       "}]"+
//					"}";
			
			
//		String abcdrepairLang =	"{" +
//			"\"button\":["+
//							"{"+
//					          "\"name\":\"登录\","+
//								"\"type\":\"view\","+
//								"\"url\":\"http://www.xcl120.com/user/index.do\""+
//					       "}," 
//							  +
//							  "{"+
//					          "\"name\":\"购物\","+
//								"\"type\":\"view\","+
//								"\"url\":\"http://www.xcl120.com/store/index.do\""+
//					           "},"
//								 +
//	                               "{"+
//	 					          "\"name\":\"注册\","+
//	 								"\"type\":\"view\","+
//	 								"\"url\":\"http://www.xcl120.com/user/toRegist.do\""+
//	 					       "}," +
// 					       "]"+
//		                "}";
			
		
		
//		String abcdrepairLangstr =	"{" +
//				"\"button\":["+
//								"{"+
//						          "\"name\":\"登录\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/toLoginPinetreeCare\""+
//						       "}," 
//								  +
//								  "{"+
//						          "\"name\":\"检测结果\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/checkResultGongKang\""+
//						           "},"
//									 +
//	 					       "]"+
//			                "}";
			
		
//		String abcdrepairLangstr =	"{" +
//				"\"button\":["+
//								"{"+
//						          "\"name\":\"登录\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/loginQSKH.jsp\""+
//						       "}," 
//								  +
//								  "{"+
//						          "\"name\":\"检测结果\","+
//									"\"type\":\"view\","+
//									"\"url\":\"http://foncti.qskh.cn/checkResultPinetreeCare\""+
//						           "},"
//									 +
//	 					       "]"+
//			                "}";
		
		
		
		
		String abcdrepairLangstr =	"{" +
				"\"button\":["+
								"{"+
						          "\"name\":\"登录\","+
									"\"type\":\"view\","+
									"\"url\":\"http://foncti.qskh.cn/toLoginHongTaiSheng\""+
						       "}," 
								  +
								  "{"+
						          "\"name\":\"检测结果\","+
									"\"type\":\"view\","+
									"\"url\":\"http://foncti.qskh.cn/checkResultHongTaiSheng\""+
						           "},"
									 +
									"{"+
									"\"name\":\"注册\","+
										"\"type\":\"view\","+
										"\"url\":\"http://foncti.qskh.cn/toHTSRegister\""+
									"}," +
	 					       "]"+
			                "}";
			
			System.out.println(abcdrepairLangstr);
			boolean result = MenuUtil.createMenu(abcdrepairLangstr, token.getAccessToken());
			
			// 判断菜单创建结果
			if (result)
				log.info("菜单创建成功！");
			else
				log.info("菜单创建失败！");
		}
	}
}
