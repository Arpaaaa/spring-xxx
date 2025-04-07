package spring.xxx;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author ArpatNurmamat <airepatinuermaimaiti@kuaishou.com>
 * Created on 2025-04-07
 */
public class BeanFactory {

    // 用HashMap实现Bean容器
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    /**
     * 注册Bean到容器中
     * @param beanName bean名称
     * @param beanDefinition bean对象
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

}