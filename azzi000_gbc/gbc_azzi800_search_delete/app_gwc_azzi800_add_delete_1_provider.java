/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package gbc_azzi800_search_delete;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class app_gwc_azzi800_add_delete_1_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public app_gwc_azzi800_add_delete_1_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());
    scenarios.add(new scenario_1());
    scenarios.add(new scenario_2());

  }

  /* Scenario app_gwc_azzi800_add_delete_1 id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 381 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 382 (dataType = "STRING", isNull = "0", value = "u") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(568);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 540 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 541 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en-US") { } }  */

      client.wait(118);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "session", name = "getvar") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "r") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(5729);
      client.setFocus("formonly.gzxd001");

      client.setValue("tiptop");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(62);
      client.key("tab");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(2860);
      client.setFocus("formonly.gzxd002");

      client.setValue("tiptop");

      client.action("login"); /* 登录 */

      client.wait(53);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 454 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 383 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 452 (dataType = "STRING", isNull = "0", value = "eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwidmFsaWQiOiJZIiwic2l0ZSI6IkRTQ1RDIiwiem9uZSI6InRvcHByZCJ9") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(28);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 452 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 383 (dataType = "STRING", isNull = "0", value = "r") { }   FunctionCallParameter 454 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(47);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 454 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 383 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 452 (dataType = "STRING", isNull = "0", value = "jIbe8chmK0RS+jWTcl7yW+qR9HP2a2rjmpzTxZtVeR3O0e3W/O1G5Jjkp7SD1cKndgkH36CDsI5sm+vzN46ZsQ==") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 452 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 383 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 454 (dataType = "STRING", isNull = "0", value = "0k5NgayBLpEEzjyF6yYrRY0rvyjIUl8z1n5JGoSG8DI=") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

    }
  }
  /* Scenario app_gwc_azzi800_add_delete_1 id: 1 */
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
      client.wait(1031);
      client.action("wc_flow_init"); /* wc_flow_init */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(97);
      client.setTableSize("s_startmenu", 45);

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(393);
      client.setFocus("formonly.wc");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(30);
      client.setValue(" ");

      client.action("wc_exec"); /* wc_exec */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(269);
      client.setValue("{\"cmd\":\"handshake\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(23);
      client.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"10.40.41.189\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(447);
      client.setFocus("formonly.searchstr");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2321);
      client.setFocus("formonly.searchstr");

      client.setValue("azzi800");

      client.action("execute"); /* execute */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(37586);
      client.action("logout"); /*  */

      client.wait(27);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "u") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(21);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "webuser") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(22);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "gwcui") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(24);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "vi") { }   FunctionCallParameter 385 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(20);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 385 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "session", name = "setvar") {   FunctionCallParameter 951 (dataType = "STRING", isNull = "0", value = "x") { }   FunctionCallParameter 953 (dataType = "STRING", isNull = "1", value = "") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") { }  */

      client.wait(23);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 953 (isSystem = "0", returnCount = "0", paramCount = "0", moduleName = "gwcjs", name = "reload") { }  */
      /* Front call result: FunctionCallEvent 0 (result = "-2") { }  */

    }
  }
  /* Scenario app_gwc_azzi800_add_delete_1 id: 2 */
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
      client.wait(2414);
      client.action("query"); /* 查詢 query */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(620);
      client.setTableSize("s_detail1_01", 10);

      client.setTableSize("s_detail1_03", 11);

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2416);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("ge");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(483);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("gez");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(388);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("geza");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(887);
      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2606);
      client.action("reproduce"); /* 複製 reproduce */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1402);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("g");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(373);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("ge");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(505);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("gez");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(361);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("geza");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(553);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("geza1");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(651);
      client.setFocus("gzxa_t.gzxa003");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2556);
      client.setFocus("gzxa_t.gzxa003");

      client.setValue("00000");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(564);
      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "cl_err_s01.tmp");
      ScenarioChecks.checkFormTitle(client, "錯誤");
      client.wait(2053);
      client.action("ok"); /* 確定 */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(939);
      client.setFocus("gzxa_t.gzxa003");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1175);
      client.setFocus("gzxa_t.gzxa001");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1105);
      client.setFocus("gzxa_t.gzxa001");

      client.setValue("geza11");

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(442);
      client.action("accept"); /* 確定 accept */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1813);
      client.action("no"); /* 否 */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1409);
      client.action("delete"); /* 刪除 delete */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1499);
      client.action("yes"); /* 是 */

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2646);
      client.action("close"); /* close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
