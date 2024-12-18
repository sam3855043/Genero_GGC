/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package gdc;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class azzi000_gdc_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public azzi000_gdc_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());
    scenarios.add(new scenario_1());

  }

  /* Scenario azzi000_gdc id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 81 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 80 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } }  */

      client.wait(1039);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 587 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 588 (dataType = "STRING", isNull = "0", value = "userPreferredLang") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "en_US") { } }  */

      client.wait(266);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 774 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 775 (dataType = "STRING", isNull = "0", value = "ostype") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } }  */

      client.wait(24);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 513 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 512 (dataType = "STRING", isNull = "0", value = "datadirectory") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "C:/Users/dgw/AppData/Local/Four Js/Genero Desktop Client/cache/ftcache") { } }  */

      client.wait(96);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 775 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 774 (     dataType = "STRING"     isNull = "0"     value = "cmd /C copy "%UserProfile%\.000session" "C:\Users\dgw\AppData\Local\Four Js\Genero Desktop Client\cache\ftcache\.000session" /Y "   ) { }   FunctionCallParameter 511 (dataType = "INTEGER", isNull = "0", value = "1") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } }  */

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(179);
      client.setTableSize("w_azzi000:s_startmenu", 36);

      client.mediaSize("large");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(4691);
      client.setFocus("formonly.gzxd001");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(37);
      client.key("tab");

      ScenarioChecks.checkFormName(client, "azzi000_s02.tmp");
      ScenarioChecks.checkFormTitle(client, "Login");
      client.wait(2555);
      client.setFocus("formonly.gzxd002");

      client.setValue("tiptop");

      client.action("login"); /* 登录 */

      client.wait(33);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 852 (isSystem = "0", returnCount = "1", paramCount = "1", moduleName = "standard", name = "feInfo") {   FunctionCallParameter 77 (dataType = "STRING", isNull = "0", value = "ostype") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "WINDOWS") { } }  */

      client.wait(53);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 855 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 856 (     dataType = "STRING"     isNull = "0"     value = "cmd /C echo {"r":"eyJhY2NvdW50IjoidGlwdG9wIiwibGFuZyI6InpoX1RXIiwibG9jYWwiOiJEU0NUQyIsInN0YXR1cyI6IlQifQ=="} > "%UserProfile%/.000session""   ) { }   FunctionCallParameter 857 (dataType = "INTEGER", isNull = "0", value = "1") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } }  */

    }
  }
  /* Scenario azzi000_gdc id: 1 */
  private class scenario_1 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      /* FRONT CALL */
      /* Ffont call: FunctionCall 81 (isSystem = "0", returnCount = "0", paramCount = "1", moduleName = "standard", name = "setwebcomponentpath") {   FunctionCallParameter 80 (dataType = "STRING", isNull = "0", value = "http://10.40.41.189/topprd/components") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } }  */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1536);
      client.setTableSize("s_startmenu", 36);

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(893);
      client.action("wc_flow_init"); /* wc_flow_init */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(219);
      client.setFocus("formonly.searchstr");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(144);
      client.setFocus("formonly.wc");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(19);
      client.setValue(" ");

      client.action("wc_exec"); /* wc_exec */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(287);
      client.setValue("{\"cmd\":\"handshake\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(45);
      client.setValue("{\"cmd\":\"chk_internal_ip\",\"hostname\":\"\"}");

      client.action("wc_get_req"); /* wc_get_req */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1019);
      client.setFocus("formonly.searchstr");

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(1546);
      client.setFocus("formonly.searchstr");

      client.setValue("azzi800");

      client.action("execute"); /* execute */

      ScenarioChecks.checkFormName(client, "azzi000v3.tmp");
      ScenarioChecks.checkFormTitle(client, "T100 系統首頁(azzi000)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(33306);
      client.action("close"); /* close */

      client.wait(42);
      /* FRONT CALL */
      /* Ffont call: FunctionCall 78 (isSystem = "0", returnCount = "1", paramCount = "2", moduleName = "standard", name = "execute") {   FunctionCallParameter 861 (dataType = "STRING", isNull = "0", value = "taskkill /f /im gdc.exe") { }   FunctionCallParameter 863 (dataType = "INTEGER", isNull = "0", value = "0") { } }  */
      /* Front call result: FunctionCallEvent 0 (result = "0") {   FunctionCallReturn 0 (dataType = "STRING", isNull = "0", value = "1") { } }  */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
