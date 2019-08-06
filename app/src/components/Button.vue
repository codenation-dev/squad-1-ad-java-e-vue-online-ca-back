<template>
    <button
      @click="onClick($event)"
      :disabled="disabled"
      :class="`default ${variation}`"
      :style="style"
    >
        <slot></slot>
    </button>
</template>

<script>
export default {
    name: 'Button',
    props: {
      disabled: Boolean,
      variation: {
        type: String,
        default: ''
      },
      height: {
        type: String,
        default: '40px',
      },
      width: {
        type: String,
        default: '100%',
      },
    },
    computed: {
      style() {
        const { height, width } = this;
        return `height: ${height}; width: ${width};`;
      }
    },
    methods: {
      onClick: function(ev) {
        this.$emit('click', ev);
      }
    }
}
</script>

<style lang="scss" scoped>
  .default {
    color: #fff;
    background-color: $default;
    border-radius: 0;
    border: 1px solid $default;
    font-size: 14px;
    cursor: pointer;
    transition: .3s ease;

    &:hover {
      background-color: $default-dark;
      border: 1px solid $default-dark;
    }

    &:active {
      background-color: #fff;
      color: $default;
      border: 1px solid $default;
    }

    &.danger {
      background-color: $danger;
      border: 1px solid $danger;
      color: #fff;

      &:hover {
        background-color: $danger-dark;
        border: 1px solid $danger-dark;
      }

      &:active {
        background-color: #fff;
        color: $danger;
        border: 1px solid $danger;
      }
    }

    &.success {
      background-color: $success;
      border: 1px solid $success;
      color: #fff;

      &:hover {
        background-color: $success-dark;
        border: 1px solid $success-dark;
      }

      &:active {
        background-color: #fff;
        color: $success;
        border: 1px solid $success;
      }
    }
  }
</style>
