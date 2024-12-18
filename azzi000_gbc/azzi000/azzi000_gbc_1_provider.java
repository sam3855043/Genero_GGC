/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package azzi000;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class azzi000_gbc_1_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public azzi000_gbc_1_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());
    scenarios.add(new scenario_1());
    scenarios.add(new scenario_2());

  }

  /* Scenario azzi000_gbc_1 id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 381 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 382 (dataType = "STRING", isNull = "0", value = "u") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */

      client.wait(526);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 541 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 542 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en-US") { } }  */

      client.wait(73);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "r") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(2213);
      client.setFocus("formonly.gzxd001");

      client.setValue("tiptop");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(98);
      client.key("tab");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(2416);
      client.setFocus("formonly.gzxd002");

      client.setValue("tiptop");

      client.action("login"); /* 登录 */

      client.wait(30);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 455 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 384 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 453 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 453 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 384 (dataType = "STRING", isNull = "0", value = "r") { }   FunctionCallParameter 455 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(39);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 455 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 384 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 453 (dataType = "STRING", isNull = "0", value = "e+VHopy8g93GlpqKr/Re2/yVShrL8Q7tR5oTxBTPaJ41DOm2yrZVJjlx89CjnnsYZbU7CGKonpqDVDACZa6Rbw==") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 453 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 384 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 455 (dataType = "STRING", isNull = "0", value = "jOgf4icD19k6abV9/3QtpS2f8pWN9BjRC8XIBSZq1pk=") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

    }
  }
  /* Scenario azzi000_gbc_1 id: 1 */
  private class scenario_1 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 381 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 382 (dataType = "STRING", isNull = "0", value = "u") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1013);
      client.action("wc_flow_init"); /* wc_flow_init */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(82);
      client.setTableSize("s_startmenu", 45);

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(410);
      client.setFocus("formonly.wc");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(24);
      client.setValue(" ");

      client.action("wc_exec"); /* wc_exec */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(265);
      client.setValue("{\"cmd\":\"handshake\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(24);
      client.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"10.40.41.189\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(270);
      client.setFocus("formonly.searchstr");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1092);
      client.setFocus("formonly.searchstr");

      client.setValue("azzi800");

      client.action("execute"); /* execute */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(30319);
      client.action("logout"); /*  */

      client.wait(40);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(34);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "webuser") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(22);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(30);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "x") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "0", paramCount = "0", moduleName = "gwcjs", name = "reload") { }  */
      /* Front call result: FunctionCallEvent 0 (result = "-2") { }  */

    }
  }
  /* Scenario azzi000_gbc_1 id: 2 */
  private class scenario_2 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.setTableSize("s_queryplan", 21);

      client.setTableSize("s_relateapps", 15);

      client.setTableSize("s_browse", 38);

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1673);
      client.action("query"); /* 查詢 query */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(746);
      client.setTableSize("s_detail1_01", 10);

      client.setTableSize("s_detail1_03", 11);

 

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(365);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("geza");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(893);
      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1239);
      client.action("reproduce"); /* 複製 reproduce */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1669);
      client.setFocus("gzxa_t.gzxa001");



      String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

      
      // StringBuilder to hold the random string
      StringBuilder salt = new StringBuilder();
      
      // Create a Random object
      Random rnd = new Random();
      
      // Generate random string of length 18
      while (salt.length() < 18) { 
          // Generate a random index to pick a character from SALTCHARS
          int index = rnd.nextInt(SALTCHARS.length());
          // Append the character to the StringBuilder
          salt.append(SALTCHARS.charAt(index));
      }
      String saltStr = salt.toString();
      client.setValue(saltStr);

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(496);
      client.setFocus("gzxa_t.gzxa003");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1755);
      client.setFocus("gzxa_t.gzxa003");

      client.setValue("00000");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1087);
      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1777);
      client.action("no"); /* 否 */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(4985);
      client.action("delete"); /* 刪除 delete */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1643);
      client.action("yes"); /* 是 */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(3073);
      client.action("close"); /* close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
