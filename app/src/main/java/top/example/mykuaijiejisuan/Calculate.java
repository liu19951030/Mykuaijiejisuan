package top.example.mykuaijiejisuan;

/**
 * Created by root on 2018/3/10.
 */

public interface Calculate {

    /**
     * 计算总宽(长)容纳子块数
     * 计算公式：总宽(长)容纳子块数 = (总长度 - 2左右(上下)外边间距 - 子长(宽)度) / (子长(宽)度 + 子块间间距) + 1
     * (totalLength - 2interval - sonlength) / (sonlength + sonInterval) + 1
     * 取整,小数舍去,不进位
     * @param totalLength 总长度
     * @param interval 左右(上下)外边间距
     * @param sonLength 子长(宽)度
     * @param sonInterval 子块间间距
     * @return 总宽(长)容纳子块数,整型
     */
    public int DirectionNumber(Double totalLength, Double interval, Double sonLength, Double sonInterval);

    /**
     * 计算总宽(长)剩余
     * 计算公式：总宽(长)剩余 = 总长度 - 2左右(上下)外边间距 - 子长(宽)度 - (子长(宽)度 + 子块间间距) + 1
     * (totalLength - 2interval - sonlength) / (sonlength + sonInterval) + 1
     * 取整,小数舍去,不进位
     * @param totalLength 总长度
     * @param sonLength 子长(宽)度
     * @param sonInterval 子块间间距
     * @param IntakeCapacity; 容纳数
     * @return 总宽(长)剩余
     */
    public Double DirectionSurplusLength(Double totalLength, Double sonLength, Double sonInterval, int IntakeCapacity);

    /**
     * 计算子块加间距占用的长度,边界间距不包含
     * @param number 数量
     * @param sonLength 子长(宽)度
     * @param sonInterval 子块间间距
     * @return
     */
    public Double DirectionLength(int number, Double sonLength, Double sonInterval);
    /**
     * 固定计算总数量
     * @param cp 计算参数对象
     * @return 计算结果对象
     */
    public CalculateResult totalNumber(CalculateParameter cp);

    /**
     * 非固定计算总长
     * @param cp 计算参数对象
     * @return 计算结果对象
     */
    public CalculateResult totalLength(CalculateParameter cp);

    /**
     * 判断长度是否足够,返回计算方案编号
     * @param totalLength
     * @param interval
     * @param sonLength
     * @return
     */
    public int selectLength(Double totalLength, Double interval, Double sonLength);
}
