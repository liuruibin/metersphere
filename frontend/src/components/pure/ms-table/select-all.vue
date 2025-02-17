<template>
  <div class="ms-table-select-all">
    <a-checkbox v-model="checked" class="text-base" :indeterminate="indeterminate" @change="handleCheckChange" />
    <a-dropdown position="bl" @select="handleSelect">
      <MsIcon type="icon-icon_down_outlined" class="dropdown-icon" />
      <template #content>
        <a-doption :value="SelectAllEnum.CURRENT">{{ t('msTable.current') }}</a-doption>
        <a-doption :value="SelectAllEnum.ALL">{{ t('msTable.all') }}</a-doption>
      </template>
    </a-dropdown>
  </div>
</template>

<script lang="ts" setup>
  import { ref, watchEffect } from 'vue';
  import { useI18n } from '@/hooks/useI18n';
  import { SelectAllEnum } from '@/enums/tableEnum';
  import MsIcon from '../ms-icon-font/index.vue';

  const { t } = useI18n();

  const emit = defineEmits<{
    (e: 'change', value: SelectAllEnum): void;
  }>();

  const props = withDefaults(defineProps<{ current: number; total: number; type: 'checkbox' | 'radio' }>(), {
    current: 0,
    total: 0,
  });

  const checked = ref(false);
  const indeterminate = ref(false);

  watchEffect(() => {
    if (props.current === 0) {
      checked.value = false;
      indeterminate.value = false;
    } else if (props.current < props.total) {
      checked.value = false;
      indeterminate.value = true;
    } else if (props.current === props.total) {
      checked.value = true;
      indeterminate.value = false;
    }
  });

  const handleSelect = (v: string | number | Record<string, any> | undefined) => {
    emit('change', v as SelectAllEnum);
  };

  const handleCheckChange = () => {
    if (checked.value) {
      handleSelect(SelectAllEnum.CURRENT);
    } else {
      handleSelect(SelectAllEnum.NONE);
    }
  };
</script>

<style lang="less" scoped>
  .ms-table-select-all {
    display: flex;
    flex-flow: row nowrap;
    align-items: center;
    .dropdown-icon {
      margin-left: 4px;
      font-size: 12px;
      border-radius: 50%;
      color: var(--color-text-4);
    }
    .dropdown-icon:hover {
      color: rgb(var(--primary-5));
    }
  }
</style>
