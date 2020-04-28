# 5100 Final Project #
### Adopter / AdopterDirectory ###

- Adopter类中有adopter的用户名和密码 用户名是用户邮箱 密码可以是String也可以是数字
- Adopter类中有adopter的年龄 工资 收容状态 还有房间的承载力 用于判定用户是否可以领养流浪动物
- Adopter类中有验证码 可以是String也可以是数字 用于邮箱登录
- AdopterDirectory类中用数组存了所有Adopter对象

### RescueCenter / RescueCenterManager / CenterManagerDirectory ###
- RescueCenter类中有center的名字 所在城市和地理位置 用于确定center的属性
- RescueCenter类中有center的承载力 用于判定是否可以继续接纳新的流浪动物
- RescueCenterManager有manager的用户名和密码 用于登录
- RescueCenterManager有manager总共处理的流浪动物的数量 用于统计
- CenterManagerDirectory类中用数组存了所有RescueCenterManager对象

### PetHospital / PetHospitalManager / HospitalManagerDirectory ###
- PetHospital类中有hospital的名字 所在城市和地理位置 用于确定hospital的属性
- PetHospital类中有该医院可治愈的动物以及可治愈的疾病 用于识别动物应该送往哪里
- PetHospital类中有数字类型的治愈率 level和承载力 用于判定对流浪动物的治疗效果
- PetHospitalManager有manager的用户名和密码 用于登录
- HospitalManagerDirectory类中用数组存了所有PetHospitalManager对象

### StrayAnimal / StrayAnimalDirectory ###
- StrayAnimal类中有流浪动物的String类型的名字 数字类型的ID和它所拥有的疾病
- StrayAnimal类中有流浪动物的物种用于送到指定医院 寻找到的地点用于判定送往指定收容所
- StrayAnimalDirectory类中用数组存了所有StrayAnimal对象

### Log ####
- Log类中有被治愈的动物的名字 以及该动物的疾病
- Log类中有时间类型的送达医院时间和治愈时间 用于确定治愈流程
- Log类中有不二型的治愈状态 该状态为记录 和医院的治愈成功率相关