<template>
  <MsPopconfirm
    type="error"
    :title="props.title"
    :sub-title-tip="props.subTitleTip"
    :loading="props.loading"
    :visible="currentVisible"
    @confirm="handleOk"
    @cancel="handleCancel"
  >
    <MsButton @click="showPopover">{{ t('common.remove') }}</MsButton>
  </MsPopconfirm>
</template>

<script setup lang="ts">
  import { useI18n } from '@/hooks/useI18n';
  import MsButton from '@/components/pure/ms-button/index.vue';
  import MsPopconfirm from '@/components/pure/ms-popconfirm/index.vue';
  import { ref } from 'vue';

  const props = defineProps<{
    title: string;
    subTitleTip: string;
    loading?: boolean;
  }>();

  const emit = defineEmits<{
    (e: 'ok'): void;
  }>();

  const { t } = useI18n();
  const currentVisible = ref(false);

  const handleOk = () => {
    emit('ok');
  };
  const handleCancel = () => {
    currentVisible.value = false;
  };

  const showPopover = () => {
    currentVisible.value = true;
  };
</script>
