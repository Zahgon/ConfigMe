package ch.jalu.configme.beanmapper.definition;

import ch.jalu.configme.beanmapper.definition.properties.BeanFieldPropertyDefinition;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyDefinition;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyExtractor;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyExtractorImpl;
import ch.jalu.configme.internal.ReflectionHelper;
import ch.jalu.configme.internal.record.RecordComponent;
import ch.jalu.configme.internal.record.RecordInspector;
import ch.jalu.configme.internal.record.RecordInspectorImpl;
import ch.jalu.typeresolver.reflect.ConstructorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Default implementation of {@link BeanDefinitionService}: provides bean definitions and caches them.
 * <p>
 * This service supports two different types of classes as beans:<ul>
 *  <li>Regular Java classes with a <b>no-arg constructor</b>: all fields that aren't static or transient
 *      will be considered as bean properties. Must have at least one property.</li>
 *  <li>Java records, whose components are considered as the bean's properties.</li>
 * </ul>
 *
 * See {@link BeanPropertyExtractor} for details on how the properties are determined for a bean class.
 */
public class BeanDefinitionServiceImpl implements BeanDefinitionService {

    private final RecordInspector recordInspector;

    private final BeanPropertyExtractor beanPropertyExtractor;

    private final Map<Class<?>, BeanDefinition> cachedDefinitionsByType = new ConcurrentHashMap<>();

    public BeanDefinitionServiceImpl() {
        this.recordInspector = new RecordInspectorImpl(new ReflectionHelper());
        this.beanPropertyExtractor = new BeanPropertyExtractorImpl();
    }

    public BeanDefinitionServiceImpl(@NotNull RecordInspector recordInspector, @NotNull BeanPropertyExtractor beanPropertyExtractor) {
        this.recordInspector = recordInspector;
        this.beanPropertyExtractor = beanPropertyExtractor;
    }

    @NotNull
    protected final RecordInspector getRecordInspector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final BeanPropertyExtractor getBeanPropertyExtractor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final Map<Class<?>, BeanDefinition> getCachedDefinitionsByType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Optional<BeanDefinition> findDefinition(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Inspects the class and returns an appropriate definition for it, if available. Null is returned if no
     * definition could be constructed for the class.
     *
     * @param clazz the class to process
     * @return bean definition for the class, or null if not applicable
     */
    @Nullable
    protected BeanDefinition createDefinitionIfApplicable(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
