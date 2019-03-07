package org.jeecf.plugin.lanaguage.handler;

import org.jeecf.osgi.enums.LanguageEnum;
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
        Integer language = (Integer) request.getAttribute("language");
        if (language != null) {
            if (LanguageEnum.JAVA.getCode() == language) {
                response.setAttribute("JavaHelper", JAVA_HELPER);
            }
        }
        return response;
    }

}
