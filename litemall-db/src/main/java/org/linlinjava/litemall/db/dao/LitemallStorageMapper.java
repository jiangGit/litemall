package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallStorage;
import org.linlinjava.litemall.db.domain.LitemallStorageExample;

public interface LitemallStorageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    long countByExample(LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int insert(LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int insertSelective(LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStorage selectOneByExample(LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStorage selectOneByExampleSelective(@Param("example") LitemallStorageExample example, @Param("selective") LitemallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallStorage> selectByExampleSelective(@Param("example") LitemallStorageExample example, @Param("selective") LitemallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    List<LitemallStorage> selectByExample(LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStorage selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallStorage.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    LitemallStorage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallStorage selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") LitemallStorage record, @Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") LitemallStorage record, @Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallStorage record, @Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallStorage record, @Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallStorage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallStorageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_storage
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}