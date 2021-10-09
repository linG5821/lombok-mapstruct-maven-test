# lombok-mapstruct-maven-test
对 lombok 与 mapstruct 同时使用时存在的冲突进行测试
通过添加 lombok-mapstruct-binding 解决, 属性找不到的冲突仅当 lombok 注释的实体与 Mapper 位于同一个 module 时会出现属性找不到的冲突