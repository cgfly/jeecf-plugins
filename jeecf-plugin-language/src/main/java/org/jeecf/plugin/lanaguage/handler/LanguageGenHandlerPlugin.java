package org.jeecf.plugin.lanaguage.handler;

import org.jeecf.common.gen.enums.LanguageEnum;
import org.jeecf.osgi.model.BoundleContext;
import org.jeecf.osgi.model.PluginRequest;
import org.jeecf.osgi.model.PluginResponse;
import org.jeecf.osgi.plugin.GenHandlerPlugin;
import org.jeecf.plugin.lanaguage.helper.JavaHelper;

/**
 * language helper plugin
 * 
 * @author jianyiming
 *
 */
public class LanguageGenHandlerPlugin implements GenHandlerPlugin {


    private static JavaHelper JAVA_HELPER = new JavaHelper();

    @Override
    public void init(BoundleContext context) {
    }

    @Override
    public PluginResponse process(PluginRequest request) {
        PluginResponse response = new PluginResponse();
        int language = (int) request.getAttribute("language");
        if (LanguageEnum.JAVA.getCode() == language) {
            response.setAttribute("JavaHelper",JAVA_HELPER);
        }
        return response;
    }

}
