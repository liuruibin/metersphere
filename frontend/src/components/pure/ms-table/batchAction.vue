<template>
  <div v-if="props.actionConfig" class="ms-table__patch-action">
    <span class="title">{{ t('msTable.batch.selected', { count: props.selectRowCount }) }}</span>
    <template v-for="(element, idx) in props.actionConfig.baseAction" :key="element.label">
      <a-divider v-if="element.isDivider" class="mx-0 my-[6px]" />
      <a-button
        v-else
        class="ml-[12px]"
        :class="{
          'arco-btn-outline--danger': element.danger,
          'ml-[16px]': idx === 0,
        }"
        type="outline"
        @click="handleSelect(element)"
        >{{ t(element.label as string) }}</a-button
      >
    </template>
    <div v-if="props.actionConfig.moreAction" class="relative top-[2px] ml-[16px] inline-block">
      <a-dropdown position="tr" @select="handleSelect">
        <a-button type="outline"><MsIcon type="icon-icon_more_outlined" /></a-button>
        <template #content>
          <template v-for="element in props.actionConfig.moreAction" :key="element.label">
            <a-divider v-if="element.isDivider" margin="4px" />
            <a-doption v-else :value="element" :class="{ delete: element.danger }">
              {{ t(element.label as string) }}
            </a-doption>
          </template>
        </template>
      </a-dropdown>
    </div>
    <a-button class="ml-[16px]" type="text" @click="emit('clear')">{{ t('msTable.batch.clear') }}</a-button>
  </div>
</template>

<script lang="ts" setup>
  import { useI18n } from '@/hooks/useI18n';
  import { BatchActionConfig, BatchActionParams } from './type';
  import MsIcon from '../ms-icon-font/index.vue';

  const { t } = useI18n();
  const props = defineProps<{
    selectRowCount?: number;
    actionConfig?: BatchActionConfig;
  }>();
  const emit = defineEmits<{
    (e: 'batchAction', value: BatchActionParams): void;
    (e: 'clear'): void;
  }>();
  const handleSelect = (item: string | number | Record<string, any> | undefined | BatchActionParams) => {
    emit('batchAction', item as BatchActionParams);
  };
</script>

<style lang="less" scoped>
  .ms-table__patch-action {
    .title {
      color: var(--color-text-2);
    }
  }
  .delete {
    border-color: rgb(var(--danger-6)) !important;
    color: rgb(var(--danger-6));
  }
</style>
