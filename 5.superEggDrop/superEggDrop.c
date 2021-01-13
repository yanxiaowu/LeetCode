//remainTestCount记录测试的机会,EggCount记录鸡蛋数
int getConformFloors(int remainTestCount, int eggCount){
    //返回最多测试的楼层数
    if(remainTestCount == 1){
        //只有一次测试机会时，只能测试第一层是不是F
        return 1;
    }
    else if(eggCount == 1){
        //只有一颗鸡蛋时，只能测试第一层到第remainTestCount层是不是F
        return remainTestCount;
    }
    //测试次数减一，确定楼层数加一，加上鸡蛋碎了后确定的楼层数，加上鸡蛋没碎时确定的楼层数
    return getConformFloors(remainTestCount - 1, eggCount - 1) + getConformFloors(remainTestCount - 1, eggCount) + 1;
}
int superEggDrop(int K, int N){
    int remainTestCount = 1;
    //如果测试不出N个楼层就加一个测试机会
    while(getConformFloors(remainTestCount, K) < N){
        remainTestCount++;
    }
    return remainTestCount;
}