
/**
 * Grid Format - A topics based format that uses a grid of user selectable images to popup a light box of the section.
 *
 * @package    format_grid
 * @version    See the value of '$plugin->version' in version.php.
 * @copyright  &copy; 2012 G J Barnard in respect to modifications of standard topics format.
 * @author     G J Barnard - {@link http://about.me/gjbarnard} and
 *                           {@link http://moodle.org/user/profile.php?id=442195}
 * @author     Based on code originally written by Paul Krix and Julian Ridden.
 * @license    http://www.gnu.org/copyleft/gpl.html GNU GPL v3 or later
 */
M.course=M.course||{};M.course.format=M.course.format||{};M.course.format.get_config=function(){return{container_node:'ul',container_class:'gtopics',section_node:'li',section_class:'section'}};M.course.format.swap_sections=function(Y,node1,node2){var CSS={COURSECONTENT:'course-content',SECTIONADDMENUS:'section_add_menus'};var sectionlist=Y.Node.all('.'+CSS.COURSECONTENT+' '+M.course.format.get_section_selector(Y));sectionlist.item(node1).one('.'+CSS.SECTIONADDMENUS).swap(sectionlist.item(node2).one('.'+CSS.SECTIONADDMENUS))};M.course.format.process_sections=function(Y,sectionlist,response,sectionfrom,sectionto){var CSS={SECTIONNAME:'sectionname',SECTIONLEFTSIDE:'left .section-handle .icon'};if(response.action=='move'){if(sectionfrom>sectionto){var temp=sectionto;sectionto=sectionfrom;sectionfrom=temp}
var ele;var str;var stridx;var newstr;for(var i=sectionfrom;i<=sectionto;i++){var content=Y.Node.create('<span>'+response.sectiontitles[i]+'</span>');sectionlist.item(i).all('.'+CSS.SECTIONNAME).setHTML(content);ele=sectionlist.item(i).one('.'+CSS.SECTIONLEFTSIDE);str=ele.getAttribute('alt');stridx=str.lastIndexOf(' ');newstr=str.substr(0,stridx+1)+i;ele.setAttribute('alt',newstr);ele.setAttribute('title',newstr)}}}