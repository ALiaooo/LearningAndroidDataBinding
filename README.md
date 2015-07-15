# LearningAndroidDataBinding
体验Data Binding库的用法

Need To Know：

Data Binding 用户指南（Android）：http://segmentfault.com/a/1190000002876984#articleHeader11

MVVM on Android: What You Need to Know ：http://www.willowtreeapps.com/blog/mvvm-on-android-what-you-need-to-know/


一、初体验
 * 1.在xml里调整根元素为layout，并添加data元素描述一个user的变量属性，以及view元素来写文件布局
 * 2.在data元素的variable标签里设置(user)变量属性后，会自动生成一个Binding类。该类是model和view数值连接的桥梁。
 *   该类的命名规则是基于layout文件名称首字母大写并连接“Binding”后缀产生，例如：
 *   activity_getting_started.xml  =>  ActivityGettingStartedBinding
 * 3.activity与layout的连接方式。以往要设置layout中的控件的值，要先findViewByid把控件找出来再去设置要显示的值。
 *  使用data binding后，就不用再在activity里直接操作layout中的控件，而是通过生成的Binding类把model中的值更新到view上。

二、自定义Binding类名称
 * Binding类通过调整data元素中的class属性来重命名或放置在不同的包中
 *
 * 1.自定义的Binding类风在databinding封装包下：com.aliao.learningdatabinding.databinding.CustomBindingName
 *     <data class="CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>
 *
 * 2.生成在不同的包下,自定义的Binding类添加前缀.(即当前包名目录下)：com.aliao.learningdatabinding.CustomBindingName
 *     <data class=".CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>
 *
 * 3.生成在不同的包下,提供整个包名路径：com.aliao.learningdatabinding.activity.CustomBindingName
 *     <data class="com.aliao.learningdatabinding.activity.CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>

